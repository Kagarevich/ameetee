package org.damir;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface AuthService {
    @RequestLine("POST /auth/obtain/")
    @Headers({
            "Accept: application/json",
            "Content-Type: application/json",
            "X-CSRFTOKEN: WYTbX8IjfCLv40qV0Vg8Oqsg0a7h0y6OnkAnPsSQweQyK6MI50UXy80uNJxj8OgW"
    })
    UserToken authAmeeteeUser(AmeeteeAuthUser requestAmeeteeUser);
    @RequestLine("PATCH /api/users/{userId}/")
    @Headers({
            "Accept: application/json",
            "Content-Type: application/json",
            "X-CSRFTOKEN: WYTbX8IjfCLv40qV0Vg8Oqsg0a7h0y6OnkAnPsSQweQyK6MI50UXy80uNJxj8OgW",
            "Authorization: Bearer {access}"
    })
    UserPatch patchAmeeteeUser(@Param("userId") int userId, @Param("access") String access, UserPatch userBeforePatch);

}
