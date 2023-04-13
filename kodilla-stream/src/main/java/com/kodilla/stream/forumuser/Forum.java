package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser(001, "firstUser", 'M', 1990, 2, 3,
                10));
        theForumUserList.add(new ForumUser(002, "secondUser", 'F', 1995, 4, 6,
                0));
        theForumUserList.add(new ForumUser(003, "thirdUser", 'F', 2000, 6, 9,
                15));
        theForumUserList.add(new ForumUser(004, "fourthUser", 'M', 2005, 8, 12,
                25));
        theForumUserList.add(new ForumUser(005, "fifthUser", 'M', 2010, 12, 15,
                4));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
