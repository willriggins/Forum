package com.theironyard;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by will on 5/26/16.
 */
public class MainTest {
    @Test
    public void parsePosts() throws Exception {
        ArrayList<Post> posts = Main.parsePosts("test.txt");

        assertTrue(posts.get(0).author.equals("alice"));
        assertTrue(posts.get(1).author.equals("bob"));
        assertTrue(posts.get(2).author.equals("charlie"));
    }
}