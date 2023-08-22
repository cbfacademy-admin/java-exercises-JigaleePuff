import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileExtension (
    public int check(String fileName)
    {if 
        (fileName == null || fileName.isEmpty() )
        {throw new InvalidFileNameException ("File name cannot be empty");
    }
    String extension = getExtension(fileName);
    if (
        fileName.endsWith(".java")

    )
    
    {return 1;}
    else {return 0;}
      
    
    }

    @Override
    public String toString() {
        return "FileExtension []";
    }
)