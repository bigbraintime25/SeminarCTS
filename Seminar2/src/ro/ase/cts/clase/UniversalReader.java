package ro.ase.cts.clase;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.readers.Reader;

public class UniversalReader {
	//TO DO
//fol ca punct de leg catre readere
	
	public static List<Aplicant> readAplicants(String fileName, Reader reader) throws NumberFormatException, FileNotFoundException{
		return reader.readAplicants(fileName);
	}
}
