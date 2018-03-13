package br.com.gsf.app;

import java.util.Scanner;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi.BColor;
import com.diogonunes.jcdp.color.api.Ansi.FColor;

public class AppLocadora {
	
	private Scanner input;
	private int entrada;
	private boolean executa = true;
	
	private ColoredPrinter printer;

	public AppLocadora() {
		this.input = new Scanner(System.in);
	}

	public void executa() {
		
		inicia();

		while (executa) {
			this.entrada = input.nextInt();

			switch (this.entrada) {
			case 1:
				adiciona();
				break;
			case 2:
				busca();
				break;
			case 3:
				buscaTodos();
				break;
			case 4:
				deleta();
				break;
			case 5:
				finaliza();
				break;

			default:
				break;
			}
		}
	}

	public void inicia() {
		System.out.println("inicia()");
		menu();
	}

	private void deleta() {
		System.out.println("deleta()");
	}

	private void buscaTodos() {
		this.printer = new ColoredPrinter.Builder(1, false)
                .foreground(FColor.WHITE).background(BColor.CYAN)   //setting format
                .build();
		this.printer.println("buscaTodos()");
		this.printer.clear();
	}

	private void busca() {
		this.printer = new ColoredPrinter.Builder(1, false)
                .foreground(FColor.WHITE).background(BColor.YELLOW)   //setting format
                .build();
		this.printer.println("busca()");
		this.printer.clear();
	}

	private void adiciona() {
		this.printer = new ColoredPrinter.Builder(1, false)
                .foreground(FColor.WHITE).background(BColor.GREEN)   //setting format
                .build();
		this.printer.println("adiciona()");
		
		this.printer.clear();
	}

	public void finaliza() {
		this.printer = new ColoredPrinter.Builder(1, false)
                .foreground(FColor.WHITE).background(BColor.RED)   //setting format
                .build();
		this.printer.println("finaliza()");
		this.printer.clear();
		this.executa = false;
		this.input.close();
	}

	public void menu() {
		this.printer = new ColoredPrinter.Builder(1, false)
                .foreground(FColor.WHITE).background(BColor.BLUE)   //setting format
                .build();
		//System.out.println("MENU >> Digite 1=adicionar, 2=buscar, 3=buscar todos, 4=deletar, 5=finalizar");
		printer.println("MENU >> Digite 1=adicionar, 2=buscar, 3=buscar todos, 4=deletar, 5=finalizar");
		
		this.printer.clear(); 
	}
}