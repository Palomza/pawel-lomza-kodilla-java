package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser(001, "firstUser", 'M', LocalDate.of(1990, 2, 3),
                10));
        theForumUserList.add(new ForumUser(002, "secondUser", 'F', LocalDate.of(1995, 4, 6),
                0));
        theForumUserList.add(new ForumUser(003, "thirdUser", 'F', LocalDate.of(2000, 6, 9),
                15));
        theForumUserList.add(new ForumUser(004, "fourthUser", 'M', LocalDate.of(2005, 8, 12),
                25));
        theForumUserList.add(new ForumUser(005, "fifthUser", 'M', LocalDate.of(2010, 10, 15),
                4));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
