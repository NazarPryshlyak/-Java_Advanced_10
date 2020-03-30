package ua.lviv.lgs.magazineShop.service;

import java.util.Map;

import ua.lviv.lgs.magazineShop.daos.DAOAbstractCRUD;
import ua.lviv.lgs.magazineShop.daos.DAOException;
import ua.lviv.lgs.magazineShop.domain.Magazine;

public interface MagazineService extends DAOAbstractCRUD<Magazine> {

    public Map<Integer, Magazine> readAllMap() throws DAOException;

}
