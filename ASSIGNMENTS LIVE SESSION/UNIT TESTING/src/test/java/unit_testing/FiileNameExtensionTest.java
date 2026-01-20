package unit_testing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FiileNameExtensionTest {

	
	FileNameExtension fne=new FileNameExtension();
	
	@Test
	void FileCheck()
	{
		assertTrue(fne.endsWithCsv("filename.csv"));
	}
	
	@Test
	void FileNotEndingWithCsv() {
		assertFalse(fne.endsWithCsv("filename.csx"));
	}
}
