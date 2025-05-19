package automacao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Backup {
	public static void main(String[] args) {

		String origem = "/home/tiago/teste.txt";
		String destino = "/home/tiago/backup/teste.txt";

		File pastaBackupFile = new File("/home/tiago/backup");

		if (!pastaBackupFile.exists()) {
			pastaBackupFile.mkdir();
			System.out.println("Pasta criada com sucesso!");
		}

		try {
			Files.copy(Paths.get(origem), Paths.get(destino), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Arquivo copiado com sucesso");

		} catch (IOException e) {
			System.out.println("Erro ao copiar arquivo " + e.getMessage());
		}

	}
}
