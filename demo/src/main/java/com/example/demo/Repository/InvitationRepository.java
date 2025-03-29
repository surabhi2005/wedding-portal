
package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Invitation;
public interface InvitationRepository extends JpaRepository<Invitation,Integer> {
}

