package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.App;
import main.Game;

class GameTest {
	@Test
	void addGame() {
		Game game = new Game("game1","MCQ");
		assertTrue(App.addGame(game));
	}
	@Test
	void getRate()
	{   Game game = new Game("game1","MCQ",10.0);
	    game.setRate(10);
		assertEquals(game.getRate(),10.0);
	}
	@Test
	void addComment()
	{   Game game = new Game("game1","MCQ",10.0);
	
		assertTrue(game.addComment("first comment"));
	}
	@Test
	void addGame_Comment()
	{
		Game game = new Game("game1","MCQ");
		assertTrue(App.addGame(game));
		assertTrue(game.addComment("first comment"));
	}
	@Test
	void addGameFail() {
		Game game = null;
		assertFalse(App.addGame(game));
	}

	
}
