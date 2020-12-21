import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimerEjercicio {

    public static void main(String[] args) {

        WebDriver driver = null;

        /* Activo el navegador */
        WebDriverManager.chromedriver().version("87.0.4280.88").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");

        /* Busco zapatillas en amazon */
        String cadenaBusqueda = "//*[@id=\"twotabsearchtextbox\"]";
        WebElement buscar = driver.findElement(By.xpath(cadenaBusqueda));
        buscar.sendKeys("zapatillas");
        buscar.sendKeys(Keys.ENTER);

        try {
            Thread.sleep(3000) ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String des1 = "//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/h2/a/span";
        String pre1 = "//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[4]/div/div/div/a/span/span[2]";

        String strAhorro = "//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[51]/div/span/div/div/div[3]/div[2]/span/span[2]/span[1]";

        WebElement odes1 = driver.findElement(By.xpath(des1));
        WebElement opre1 = driver.findElement(By.xpath(pre1));

        System.out.println(odes1.getText());
        System.out.println(opre1.getText());

        String cadenaSeleccion = "//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/span/a/div/img";
        WebElement seleccion = driver.findElement(By.xpath(cadenaSeleccion));
        seleccion.click();



    }
}
