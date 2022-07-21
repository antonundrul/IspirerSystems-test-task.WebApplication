package by.undrul.backend.mapper;


import by.undrul.backend.dto.UserDto;
import by.undrul.backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    @Autowired
    public UserMapper() {
    }

    public UserDto mapToDto(User user){
        UserDto userDto = new UserDto();
        userDto.setName(user.getName());
        userDto.setAge(user.getAge());
        userDto.setObjectsNumber(User.count());
        return userDto;
    }


}
