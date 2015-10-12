package exam;

import java.util.Scanner;

public class DragonSharp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			int countLines = scanner.nextInt();
			scanner.nextLine();
			String[] commands = new String[countLines];
			boolean hasError = false;
			for(int i = 0; i < countLines; i++){
				String line = scanner.nextLine();
				if(!line.contains("\"")){
					System.out.printf("Compile time error @ line %d", i + 1);
					hasError = true;
				}
				if(!line.endsWith(";")){
					System.out.printf("Compile time error @ line %d", i + 1);
					hasError = true;
				}
				commands[i] = line;
			}
			if (! hasError){
				for(int i = 0; i < countLines; i++){
					String[] token = commands[i].split(" ");
					if (token[0].toUpperCase().equals("IF")){
						if (token[1].contains("<")){
							token[1] = token[1].substring(1, token[1].length() - 1);
							String[] b = token[1].split("<");
							if (Integer.parseInt(b[0]) < Integer.parseInt(b[1])){
								if (token[2].toUpperCase().equals("LOOP")){
									int loop = Integer.parseInt(token[3]);
									for(int j = 0; j < loop; j++){
										String s = commands[i].substring(commands[i].indexOf("\"") + 1, commands[i].length() - 2);
										System.out.println(s);
									}
								}
								else{
									String s = commands[i].substring(commands[i].indexOf("\"") + 1, commands[i].length() - 2);
									System.out.println(s);
								}
									
							}
							else{
								// ще търся на следващия ред else
								if (i + 1 < countLines){
									token = commands[i + 1].split(" ");
									if (token[0].toUpperCase().equals("ELSE")){
										
										if (token[1].toUpperCase().equals("LOOP")){
											int loop = Integer.parseInt(token[2]);
											for(int j = 0; j < loop; j++){
												String s = commands[i + 1].substring(commands[i + 1].indexOf("\"") + 1, commands[i + 1].length() - 2);
												System.out.println(s);

											}
										}
										else{
											String s = commands[i + 1].substring(commands[i + 1].indexOf("\"") + 1, commands[i + 1].length() - 2);
											System.out.println(s);
										}
										i++;
									}
								}
							}
								
						}
						else if (token[1].contains(">")){
							token[1] = token[1].substring(1, token[1].length() - 1);
							String[] b = token[1].split(">");
							if (Integer.parseInt(b[0]) > Integer.parseInt(b[1])){
								if (token[2].toUpperCase().equals("LOOP")){
									int loop = Integer.parseInt(token[3]);
									for(int j = 0; j < loop; j++){
										String s = commands[i].substring(commands[i].indexOf("\"") + 1, commands[i].length() - 2);
										System.out.println(s);
									}
								}
								else{
									String s = commands[i].substring(commands[i].indexOf("\"") + 1, commands[i].length() - 2);
									System.out.println(s);
								}
									
							}
							else{
								// ще търся на следващия ред else
								if (i + 1 < countLines){
									token = commands[i + 1].split(" ");
									if (token[0].toUpperCase().equals("ELSE")){
										
										if (token[1].toUpperCase().equals("LOOP")){
											int loop = Integer.parseInt(token[2]);
											for(int j = 0; j < loop; j++){
												String s = commands[i + 1].substring(commands[i + 1].indexOf("\"") + 1, commands[i + 1].length() - 2);
												System.out.println(s);
											}
										}
										else{
											String s = commands[i + 1].substring(commands[i + 1].indexOf("\"") + 1, commands[i + 1].length() - 2);
											System.out.println(s);
										}
										i++;
									}
								}
							}
						}
						else{
							token[1] = token[1].substring(1, token[1].length() - 1);
							String[] b = token[1].split("==");
							if (Integer.parseInt(b[0]) == Integer.parseInt(b[1])){
								if (token[2].toUpperCase().equals("LOOP")){
									int loop = Integer.parseInt(token[3]);
									for(int j = 0; j < loop; j++){
										String s = commands[i].substring(commands[i].indexOf("\"") + 1, commands[i].length() - 2);
										System.out.println(s);
									}
								}
								else{
									String s = commands[i].substring(commands[i].indexOf("\"") + 1, commands[i].length() - 2);
									System.out.println(s);
								}
									
							}
							else{
								// ще търся на следващия ред else
								if (i + 1 < countLines){
									token = commands[i + 1].split(" ");
									if (token[0].toUpperCase().equals("ELSE")){
										
										if (token[1].toUpperCase().equals("LOOP")){
											int loop = Integer.parseInt(token[2]);
											for(int j = 0; j < loop; j++){
												String s = commands[i + 1].substring(commands[i + 1].indexOf("\"") + 1, commands[i + 1].length() - 2);
												System.out.println(s);
											}
										}
										else{
											String s = commands[i + 1].substring(commands[i + 1].indexOf("\"") + 1, commands[i + 1].length() - 2);
											System.out.println(s);
										}
										i++;
									}
								}
							}
						}
					}
				}
			}
			
		}
		finally{
			scanner.close();
		}

	}

}
