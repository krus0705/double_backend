/**
 * NOTE: This class is auto generated by the swagger code generator program ().
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.mogree.server.gen.api;

import com.mogree.server.gen.model.UserModel;
import com.mogree.spring.response.ListResponse;
import com.mogree.spring.Executer;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@javax.annotation.Generated(value = "class com.mogree.MogreeCodeGen", date = "2021-05-11T13:27:53.093+02:00")

@RestController
@Api(value = "admin", description = "the admin API")

public interface AdminApi {

    @ApiOperation(value = "Get a list of registered users", nickname = "getUserList", notes = "", authorizations = {
        @Authorization(value = "BasicAuth")
    })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ListResponse<UserModel>"  ) })
    @RequestMapping(value = "/admin/user",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ListResponse<UserModel>> getUserList(@ApiParam(value = "Paging offset", required = true, defaultValue = "0", example = "0")  @RequestParam(value = "offset", required = true, defaultValue="0") Integer offset,@ApiParam(value = "Paging limit", required = true, defaultValue = "-1", example = "-1")  @RequestParam(value = "limit", required = true, defaultValue="-1") Integer limit,@ApiParam(value = "Sort the list", allowableValues = "createdAt")  @RequestParam(value = "sort_column", required = false) String sortColumn,@ApiParam(value = "Sort Order", allowableValues = "asc, desc")  @RequestParam(value = "sort_order", required = false) String sortOrder);

}
