package com.example.paintapi.paint;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paint")
public class Paint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(nullable = false)
    private int red;

    @Column(nullable = false)
    private int green;

    @Column(nullable = false)
    private int blue;

    @Column(length = 50, nullable = false)
    private String type;

    @Column(nullable = false)
    private int amount = 0;  // デフォルト0（ml）

    @Column(length = 50)
    private String category;

    // --- Getter & Setter ---

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getRed() { return red; }

    public void setRed(int red) { this.red = red; }

    public int getGreen() { return green; }

    public void setGreen(int green) { this.green = green; }

    public int getBlue() { return blue; }

    public void setBlue(int blue) { this.blue = blue; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public int getAmount() { return amount; }

    public void setAmount(int amount) { this.amount = amount; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }
}
