package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Test
    public void testCalculateAdvStatisticsWithZeroPosts() {
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator();
        List<String> users = new ArrayList<>();
        users.add("User1");
        users.add("User2");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(2, calculator.getUsersCount());
        Assertions.assertEquals(0, calculator.getPostsCount());
        Assertions.assertEquals(0, calculator.getCommentsCount());
        Assertions.assertEquals(0, calculator.getAveragePostsPerUser());
        Assertions.assertEquals(0, calculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0, calculator.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsWithThousandPosts(){
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator();
        List<String> users = new ArrayList<>();
        users.add("User1");
        users.add("User2");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(2, calculator.getUsersCount());
        Assertions.assertEquals(1000, calculator.getPostsCount());
        Assertions.assertEquals(0, calculator.getCommentsCount());
        Assertions.assertEquals(500, calculator.getAveragePostsPerUser());
        Assertions.assertEquals(0, calculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0, calculator.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroComments(){
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator();
        List<String> users = new ArrayList<>();
        users.add("User1");
        users.add("User2");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(4);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(2, calculator.getUsersCount());
        Assertions.assertEquals(4, calculator.getPostsCount());
        Assertions.assertEquals(0, calculator.getCommentsCount());
        Assertions.assertEquals(2, calculator.getAveragePostsPerUser());
        Assertions.assertEquals(0, calculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0, calculator.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsWithMorePostsThanComments(){
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator();
        List<String> users = new ArrayList<>();
        users.add("User1");
        users.add("User2");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(4);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(2, calculator.getUsersCount());
        Assertions.assertEquals(10, calculator.getPostsCount());
        Assertions.assertEquals(4, calculator.getCommentsCount());
        Assertions.assertEquals(5, calculator.getAveragePostsPerUser());
        Assertions.assertEquals(2, calculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0.4, calculator.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsWithMoreCommentsThanPosts(){
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator();
        List<String> users = new ArrayList<>();
        users.add("User1");
        users.add("User2");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(4);
        when(statisticsMock.commentsCount()).thenReturn(10);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(2, calculator.getUsersCount());
        Assertions.assertEquals(4, calculator.getPostsCount());
        Assertions.assertEquals(10, calculator.getCommentsCount());
        Assertions.assertEquals(2, calculator.getAveragePostsPerUser());
        Assertions.assertEquals(5, calculator.getAverageCommentsPerUser());
        Assertions.assertEquals(2.5, calculator.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroUsers(){
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator();
        List<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, calculator.getUsersCount());
        Assertions.assertEquals(0, calculator.getPostsCount());
        Assertions.assertEquals(0, calculator.getCommentsCount());
        Assertions.assertEquals(0, calculator.getAveragePostsPerUser());
        Assertions.assertEquals(0, calculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0, calculator.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsWithHundredUsers(){
        //Given
        StatisticsCalculator calculator = new StatisticsCalculator();
        List<String> users = new ArrayList<>();
        for(int i = 0; i<100; i++){
            users.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(100, calculator.getUsersCount());
        Assertions.assertEquals(0, calculator.getPostsCount());
        Assertions.assertEquals(0, calculator.getCommentsCount());
        Assertions.assertEquals(0, calculator.getAveragePostsPerUser());
        Assertions.assertEquals(0, calculator.getAverageCommentsPerUser());
        Assertions.assertEquals(0, calculator.getAverageCommentsPerPost());
    }
}
