package com.max.team.service;

import com.max.team.domain.*;
import com.max.team.exception.TeamException;

/**
 * ClassName: TeamService
 * Package: com.max.team.service
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/30 09:54
 * @Version 1.0
 */
public class TeamService {
    private static int counter;
    private final int MAX_MEMBER;
    private Programmer[] programmers;
    private int total;

    public TeamService() {
        counter = 1;
        MAX_MEMBER = 5;
        programmers = new Programmer[MAX_MEMBER];
    }
    public Programmer[] getTeam() {
        Programmer[] tmp = new Programmer[total];
        for (int i = 0; i < total; i++) {
            tmp[i] = programmers[i];
        }
        return tmp;
    }
    public void addMember(Employee e) throws TeamException {
        int count = 0;
        if(total == MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        if(!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        Programmer p = (Programmer) e;
        if(p.getStatus() == Status.BUSY) {
            throw new TeamException("该员工已是某团队成员");
        }
        if(p.getStatus() == Status.VOCATION) {
            throw new TeamException("该员工正在休假，无法添加");
        }

        int pCount, dCount, aCount;
        pCount = dCount = aCount = 0;

        for (int i = 0; i < total; i++) {
            if(programmers[i] instanceof Programmer) {
                pCount++;
            } else if(programmers[i] instanceof Designer) {
                dCount++;
            } else if(programmers[i] instanceof Architect) {
                aCount++;
            }
        }

        if(p instanceof Architect) {
            if(aCount >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if(p instanceof Designer) {
            if(dCount >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else {
            if(pCount >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }
        programmers[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);

    }

    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (i = 0; i < total; i++) {
            if(memberId == programmers[i].getMemberId()) {
                programmers[i].setStatus(Status.FREE);
                break;
            }
        }
        if(i == total) {
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }
        for (int j = i; j < total - 1; j++) {
            programmers[j] = programmers[j + 1];
        }
        total--;
    }
}
