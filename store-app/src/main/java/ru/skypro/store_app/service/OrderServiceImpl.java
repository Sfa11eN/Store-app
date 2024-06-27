package ru.skypro.store_app.service;

import org.springframework.stereotype.Service;
import ru.skypro.store_app.model.Busket;

import java.util.List;
@Service

public class OrderServiceImpl implements OrderService{
    private final Busket busket;

    public OrderServiceImpl(Busket busket) {
        this.busket = busket;
    }

    @Override
    public List<Integer> addItems(List<Integer> ids) {
        return busket.addItems(ids);
    }

    @Override
    public List<Integer> getItems() {
        return busket.getItems();
    }
}
