package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.NotFoundException;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

@ApplicationScoped
public class FruitService {

    private Set<Fruit> fruits = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    private AtomicLong counter = new AtomicLong(2);

    public FruitService() {
        fruits.add(new Fruit(1L, "Apple", "Winter fruit"));
        fruits.add(new Fruit(2L, "Pineapple", "Tropical fruit"));
    }

    public Set<Fruit> list() {
        return fruits;
    }

    public Optional<Fruit> findById(Long id) {
        return fruits.stream().filter(f -> f.getId().equals(id)).findFirst();
    }

    public Fruit create(Fruit fruit) {
        fruit.setId(counter.incrementAndGet());
        fruits.add(fruit);
        return fruit;
    }

    public Fruit update(Long id, Fruit fruit) {
        Fruit toUpdate = findById(id).orElseThrow(NotFoundException::new);
        toUpdate.setName(fruit.getName());
        toUpdate.setDescription(fruit.getDescription());
        return toUpdate;
    }

    public boolean delete(Long id) {
        return fruits.removeIf(fruit -> fruit.getId().equals(id));
    }
}
