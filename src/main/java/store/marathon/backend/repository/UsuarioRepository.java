package store.marathon.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.marathon.backend.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
