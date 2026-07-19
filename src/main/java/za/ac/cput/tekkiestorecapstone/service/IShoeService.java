package za.ac.cput.tekkiestorecapstone.service;

import za.ac.cput.tekkiestorecapstone.domain.Shoe;

import java.util.List;

public interface IShoeService extends IService<Shoe, String> {
    List<Shoe> getAll();
}
