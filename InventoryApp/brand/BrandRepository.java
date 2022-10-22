package com.example.InventoryApp.brand;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface BrandRepository extends JpaRepository<Brand , Integer> {
}
