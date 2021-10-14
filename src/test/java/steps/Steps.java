package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {

    private static WebDriver driver;

    @Dado("que o usuário esteja no sistema devMedia")
    public void acessSystem() {

        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome,driver", "C:\\Users\\julia\\Documents\\QA\\automationTest\\chromedriver.exe");
        driver.get("https://www.devmedia.com.br/");

    }

    @Quando("clicar na opção de login")
    public void clickLogin() {

        driver.findElement(By.className("link-login-devmedia")).click();

    }

    @Entao("o sistema exibe o modal de login com os campos Usuário e Senhas")
    public void modalLogin() {

        String confirmacao = driver.findElement(By.className("submit-form-devmedia")).getText();
        Assert.assertEquals("Entrar", confirmacao);

        Boolean confirmacaoLogin = driver.findElement(By.cssSelector("label[for='usuario']")).isDisplayed();
        Assert.assertEquals(true, confirmacaoLogin);

        Boolean confirmacaoSenha = driver.findElement(By.cssSelector("label[for='senha']")).isDisplayed();
        Assert.assertEquals(true, confirmacaoSenha);
    }

    @E("informar dados inválidos")
    public void dadosInvalidos(){

        driver.findElement(By.cssSelector("input[name='usuario']")).sendKeys("quweiy");
        driver.findElement(By.cssSelector("input[name='senha']")).sendKeys("000000");

    }

    @E("clicar na opção de Entrar")
    public void opcaoEntrar(){

        driver.findElement(By.className("submit-form-devmedia")).click();

    }

    @Entao("o sistema direciona o usuário para a tela de cadastro com a mensagem de login e senha inválidos")
    public void messageInvalid(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String confirmacaoMensagem = driver.findElement(By.id("aviso-login")).getText();
        Assert.assertEquals("Login ou senha inválido", confirmacaoMensagem);

    }

    @E("informar dados inexistentes")
    public void dadosInexistentes(){

        driver.findElement(By.cssSelector("input[name='usuario']")).sendKeys("haushaus");
        driver.findElement(By.cssSelector("input[name='senha']")).sendKeys("00000");

    }

    @E("clicar na opção Esqueceu o login ou a senha?")
    public void esqueceuDados(){

      driver.findElement(By.className("lembrar-senha-devmedia")).click();

    }

    @Entao("o sistema direciona o usuário para a tela de Esqueci minha senha")
    public void telaEsqueci(){

        String confirmacaoRedefinir = driver.findElement(By.xpath("/html/body/section/main/section/div/div/div[2]/form/ul/li[1]/label[1]")).getText();
        Assert.assertEquals("Redefinir senha usando:", confirmacaoRedefinir);

    }

    @E("clicar na opção Cadastre-se")
    public void clicarCadastro(){

        driver.findElement(By.className("cadastro-devmedia")).click();

    }

    @Entao("o sistema direciona o usuário para a tela de Cadastre-se")
    public void telaCadastro(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String confirmacaoCadastro = driver.findElement(By.xpath("/html/body/section/main/section/div[1]/div/div/div[2]/label")).getText();
        Assert.assertEquals("Criar conta grátis", confirmacaoCadastro);

    }

    @E("informar dados existentes")
    public void dadosExistentes(){

        driver.findElement(By.cssSelector("input[name='usuario']")).sendKeys("juliafernandacarbone@hotmail.com");
        driver.findElement(By.cssSelector("input[name='senha']")).sendKeys("julia0393");

    }

    @Entao("o sistema direciona o usuário para a tela de Bem Vindo")
    public void telaBemvindo(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String confirmacaoLogin = driver.findElement(By.className("block-conteudo-button")).getText();
        Assert.assertEquals("Teste grátis", confirmacaoLogin);

    }
}




