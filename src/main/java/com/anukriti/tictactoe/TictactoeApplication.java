package com.anukriti.tictactoe;

import com.anukriti.tictactoe.Service.BoardGames;
import com.anukriti.tictactoe.Service.TicTacToeGameService;
import com.anukriti.tictactoe.Strategy.Implementation.HumanPlayerStrategy;
import com.anukriti.tictactoe.Strategy.PlayerStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TictactoeApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Player O's name: ");
		String playerOName = scanner.nextLine();

		PlayerStrategy xStrategy = new HumanPlayerStrategy("Anukriti");
		PlayerStrategy oStrategy = new HumanPlayerStrategy(playerOName);

		BoardGames game = new TicTacToeGameService(xStrategy, oStrategy, 3, 3);
		game.play();
	}

}
