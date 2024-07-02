package dataFactory;
import pojo.UsuarioPojo;

public class UsuarioDataFactory {
    public static UsuarioPojo criarUsuarioAdministrador(String login, String senha){
        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setUsuarioLogin(login);
        usuario.setUsuarioSenha(senha);
    return usuario;
    }
}
