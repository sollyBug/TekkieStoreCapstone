package za.ac.cput.tekkiestorecapstone.service;

import za.ac.cput.tekkiestorecapstone.domain.ShoeVariant;

import java.util.List;

public interface IShoeVariantService extends IService<ShoeVariant, String> {
    List<ShoeVariant> getAll();
}
