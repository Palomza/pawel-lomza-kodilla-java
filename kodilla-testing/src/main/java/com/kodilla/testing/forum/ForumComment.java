package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumComment {

    private ForumPost forumpost;
    private String commentBody;
    private String author;

    public ForumComment(ForumPost forumpost, String commentBody, String author) {
        this.forumpost = forumpost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public ForumPost getForumpost() {
        return forumpost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumComment that = (ForumComment) o;

        if (!Objects.equals(forumpost, that.forumpost)) return false;
        if (!Objects.equals(commentBody, that.commentBody)) return false;
        return Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        int result = forumpost != null ? forumpost.hashCode() : 0;
        result = 31 * result + (commentBody != null ? commentBody.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
