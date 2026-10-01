import com.napier.sem.App;

public static void main(String[] args)
{
    // Create new Application
    App a = new App();

    // Connect to database
    a.connect();

    // Disconnect from database
    a.disconnect();
}