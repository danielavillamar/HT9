// DANIELA VILLAMAR 19086
// MIRKA MONZON 18139
// 22/04/2020
// HT9

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

public class MyTests {

    @Test
    public void TestBinaryTreeDictionary() {
    	BSTFactory bstFactory = new BSTFactory();
    	BSTInterface bst;
    	bst = bstFactory.create("RedBlack");
    	//Se lee el archivo txt con las palabras traducidas que tendra el diccionario
    			try {
    				Stream<String> lines = Files.lines(Paths.get("Spanish.txt"),StandardCharsets.UTF_8);
    				lines.forEach(i->{
    					String english = i.substring(i.indexOf("(")+1, i.indexOf(","));
    					String spanish = i.substring(i.indexOf(",")+2, i.indexOf(")"));
    					if(!bst.contains(english))
    						bst.put(english, spanish);
    				});
    			} catch (IOException e) {
    				// TODO: handle exception
    				e.printStackTrace();
    			}
    	
    		Boolean hasHi = bst.contains("hi");
    		String hi = (String) bst.get("hi");
    		assertEquals(null, hi,"Debe devolver null porque no existe." ); 			
    }
}
