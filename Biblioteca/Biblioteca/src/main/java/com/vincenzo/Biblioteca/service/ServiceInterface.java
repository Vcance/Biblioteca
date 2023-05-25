package com.vincenzo.Biblioteca.service;

import java.util.List;

public interface ServiceInterface<DTO> {
    public List<DTO> getall();
    public DTO insert(DTO dto);
    public DTO read(Long id);
    public DTO update(DTO dto);
    public void delete(Long id);


}
