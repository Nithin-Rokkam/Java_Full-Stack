package Collections;

import java.util.*;

public class MiniTextEditor {

	static StringBuilder document = new StringBuilder();
	static Stack<String> undoStack = new Stack<>();
	static Stack<String> redoStack = new Stack<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("\n=== MINI TEXT EDITOR ===");
			System.out.println("1. Add Text");
			System.out.println("2. Delete Text");
			System.out.println("3. Search Word");
			System.out.println("4. Replace Word");
			System.out.println("5. Undo");
			System.out.println("6. Redo");
			System.out.println("7. Display Document");
			System.out.println("8. Exit");
			System.out.print("Choose: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter text: ");
				addText(sc.nextLine());
				break;

			case 2:
				System.out.print("Enter number of characters to delete: ");
				deleteText(sc.nextInt());
				sc.nextLine();
				break;

			case 3:
				System.out.print("Enter word to search: ");
				searchWord(sc.nextLine());
				break;

			case 4:
				System.out.print("Enter word to replace: ");
				String oldWord = sc.nextLine();
				System.out.print("Enter replacement: ");
				String newWord = sc.nextLine();
				replaceWord(oldWord, newWord);
				break;

			case 5:
				undo();
				break;

			case 6:
				redo();
				break;

			case 7:
				displayDocument();
				break;

			case 8:
				System.out.println("Exiting editor...");
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	static void saveStateForUndo() {
		undoStack.push(document.toString());
		redoStack.clear();
	}

	static void addText(String text) {
		saveStateForUndo();
		document.append(text);
		System.out.println("Text added successfully!");
	}

	static void deleteText(int n) {
		if (n > document.length()) {
			System.out.println("Not enough characters to delete!");
			return;
		}
		saveStateForUndo();
		document.delete(document.length() - n, document.length());
		System.out.println("Text deleted successfully!");
	}

	static void searchWord(String word) {
		if (document.indexOf(word) != -1) {
			System.out.println("Word found in document.");
		} else {
			System.out.println("Word not found.");
		}
	}

	static void replaceWord(String oldWord, String newWord) {
		if (document.indexOf(oldWord) == -1) {
			System.out.println("Word not found.");
			return;
		}
		saveStateForUndo();
		String updated = document.toString().replace(oldWord, newWord);
		document = new StringBuilder(updated);
		System.out.println("Text replaced successfully!");
	}

	static void undo() {
		if (undoStack.isEmpty()) {
			System.out.println("Nothing to undo!");
			return;
		}
		redoStack.push(document.toString());
		document = new StringBuilder(undoStack.pop());
		System.out.println("Undo successful!");
	}

	static void redo() {
		if (redoStack.isEmpty()) {
			System.out.println("Nothing to redo!");
			return;
		}
		undoStack.push(document.toString());
		document = new StringBuilder(redoStack.pop());
		System.out.println("Redo successful!");
	}

	static void displayDocument() {
		System.out.println("Current Document:");
		System.out.println(document);
	}
}
