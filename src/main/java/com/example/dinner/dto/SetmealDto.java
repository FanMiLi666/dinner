package com.example.dinner.dto;

import com.example.dinner.entity.Setmeal;
import com.example.dinner.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
