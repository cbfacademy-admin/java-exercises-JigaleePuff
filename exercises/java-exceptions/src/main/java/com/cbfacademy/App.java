package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
{ List <String> fileNamesList = List.of("App.java", "App.txt", null, "App.md");
FileExtension fileExtension = new FileExtension();

Map <String, Integer> FileExtensionMap = new HashMap <>();

Map<String, Integer> resultMap;
for (String fileName : fileNames) {
    try {
        int result = fileExtension.check(fileName);
        resultMap.put(fileName, result);
    } catch (CustomException e) {
        resultMap.put(fileName, -1);
    }
}

for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
}
}



