import java.util.ArrayList;

class GerenciadorUsuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void listarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println("Usuário: " + u.getNome() + ", Idade: " + u.getIdade());
        }
    }
}

