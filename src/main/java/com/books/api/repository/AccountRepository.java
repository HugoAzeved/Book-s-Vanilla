package com.books.api.repository;

import com.books.api.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDate;
import java.util.Optional;

@CrossOrigin
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByEmail(String email);
    Optional<Account> findByCpf(String cpf);
    Optional<Account> findByTel(String tel);
    Optional<Account> findByEmailAndCpfAndBirth(String email, String cpf, LocalDate birth);
}
