package com.example.target.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project : MultiModule
 * Created by OKESTRO
 * Developer : jonghwee
 * Date Time : 2022/09/05 20:21
 * Summary :
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private String name;
    private String job;
    private String birthday;
}
