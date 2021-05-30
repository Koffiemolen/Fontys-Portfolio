# Deelvraag: Hoe complex wordt de code?

The command pattern encapsulates a request as an object thereby letting you parameterize other objects with different requests que or log requests and support undoable operations.
![[2msosq.jpg]]

Het klinkt ingewikkeld, maar het is eenvoudig te implementeren.
De commandos zijn een klasse-object, deze kunnen aangepast of uitgebreid worden door een ander object.

Het Command pattern leent zich ervoor om uit te breiden. Dit kan eenvoudig door een nieuwe methode toe te voegen aan de ontvanger en een nieuwe Command implementatie creeeren zonder de code van de Client aan te passen.

Nadeel van het command pattern is, is dat er veel code bij komt dat verwarrend kan werken doordat er meer methodes toegevoegd worden en veel kleine klassen aangemaakt worden.

### Samengevat:
- Het Command object is de kern van het command design pattern dat het contract definieerd voor de implementatie
- De Receiver(ontvanger) implementatie staat los van het command implementatie
- De Invoker() klasse stuurt alleen het verzoek van de Client naar het command object
- De Client is verantwoordelijk voor het initializeren van het geschikte command en ontvanger objecten en vervolgens deze aan elkaar te koppelen
-  De Client is ook verantwoordelijk voor het instantieeren van het Invoker-object en de assosiatie van het command object en het uitvoeren van de execute methode

### Voorbeeld:
Command klasse:
```Java
import java.io.File;

interface Command {
    void execute();

    // could add an undo or redo commands
}
```


```Java
class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    // store previous stat for undo, String someState

    public OpenFileCommand(FileSystemReceiver fs) {
        fileSystem = fs;
    }

    @Override
    public void execute() {
        // save previous state, in case undo called  someState = …….;
        this.fileSystem.openFile();
    }
}


class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}

class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}



```

---
Receiver Interface:
```Java
public interface FileSystemReceiver{
	void openFile();
	void writeFile();
	void closeFile();
}
```
---
Receiver klasse:
```Java
import java.io.FilterInputStream;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
```


```Java
class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in unix OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in unix OS");
    }
}

class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows OS");
    }

}

```

---

Invoker klasse:
```Java
public class FileInvoker {  
    public Command command;  
  
 public FileInvoker(Command comm){  
        command \= comm;  
 }  
  
    public void execute(){  
        command.execute();  
 }  
}
```

Helper klasse om te bepalen om welk besturingssysteem het gaat:
```Java
public class FileSystemReceiverUtil {  
  
    public static FileSystemReceiver getUnderlyingFileSystem(){  
        String osName = System.getProperty("os.name");  
 System.out.println("Underlying OS is: " \+ osName);  
 if(osName.contains("Windows")){  
            return new WindowsFileSystemReceiver();  
 }else {  
            return new UnixFileSystemReceiver();  
 }  
    }  
}
```

De client:
```Java
public class Client {  
    public static void main(String\[\] args) {  
  
        // creating the receiver  
 FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();  
  
 // create the command with the associating receiver  
 OpenFileCommand openFileCommand = new OpenFileCommand(fs);  
  
 // creating invoker and associate it with the command  
 FileInvoker file = new FileInvoker(openFileCommand);  
  
 // perform action on invoker object  
 file.execute();  
  
 WriteFileCommand writeFileCommand = new WriteFileCommand(fs);  
 file = new FileInvoker(writeFileCommand);  
 file.execute();  
  
 CloseFileCommand closeFileCommand = new CloseFileCommand(fs);  
 file = new FileInvoker(closeFileCommand);  
 file.execute();  
 }  
}
```


## Voorbeeld2
Voorbeeld van een bestelling in een restaurant.
1.  interface Command
2.  Klasse Order implements Command interface
3.  Klasse Waiter (invoker)
4.  Klasse Chef (receiver)

Chef, de ontvanger
```java
public class Chef {
	public void cookPasta() {
		System.out.println(“Chef is cooking Chicken Alfredo…”);
	}

	public void bakeCake() {
		System.out.println(“Chef is baking Chocolate Fudge Cake…”);
	}
}
```

Interface Command
```java
public interface Command {
	public abstract void execute();
}
```

De bestelling, the (concrete) command
```java
public class Order implements Command {
	private Chef chef;
	private String food;

	public Order(Chef chef, String food) {
		this.chef = chef;
		this.food = food;
	}

	@Override
	public void execute() {
		if (this.food.equals(“Pasta”)) {
			this.chef.cookPasta();
		} else {
			this.chef.bakeCake();
		}
	}
}
```

Waiter, de invoker
```java
public class Waiter {
	private Order order;

	public Waiter(Order ord) {
		this.order = ord;
	}

	public void execute() {
		this.order.execute();
	}
}
```

Ik, de klant
```java
public class Client {
	public static void main(String[] args) {
		Chef chef = new Chef();
        
		Order order = new Order(chef, “Pasta”);
		Waiter waiter = new Waiter(order);
		waiter.execute();

		order = new Order(chef, “Cake”);
		waiter = new Waiter(order);
		waiter.execute();
	}
}
```

Zoals je in de voorbeelden kan zien kan het aantal klassen en methoden behoorlijk toenemen. Dit kan het geheel onoverzichtelijker maken maar het weegt niet op tegen de voordelen die dit pattern biedt.

### Bronnen

[Observation](https://ictresearchmethods.nl/Observation)