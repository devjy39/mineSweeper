package com.zerobase.minesweeper.entity;

import com.zerobase.minesweeper.type.Role;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Gamer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String mail;
    private String pswd;
    private String authCode;
    private boolean isVerified;
    @Enumerated(EnumType.STRING)
    private Role role;
}