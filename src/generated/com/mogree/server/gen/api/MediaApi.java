/**
 * NOTE: This class is auto generated by the swagger code generator program ().
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.mogree.server.gen.api;

import com.mogree.spring.response.StatusResponse;
import com.mogree.spring.Executer;
import com.mogree.server.gen.model.MediaModel;
import com.mogree.spring.response.ListResponse;
import com.mogree.spring.response.DetailResponse;
import org.springframework.core.io.Resource;
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
@Api(value = "media", description = "the media API")

public interface MediaApi {

    @ApiOperation(value = "Delete an uploaded media item by mediaId", nickname = "deleteImage", notes = "", authorizations = {
        @Authorization(value = "BasicAuth")
    })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "StatusResponse"  ),
        @ApiResponse(code = 403, message = "user has no access to the media item"  ),
        @ApiResponse(code = 404, message = "Image not found"  ) })
    @RequestMapping(value = "/media/{mediaId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<StatusResponse> deleteImage(@ApiParam(value = "",required=true, example = "0") @PathVariable("mediaId") Integer mediaId);


    @ApiOperation(value = "Get all media items of the model e.g. product", nickname = "getMedia", notes = "", authorizations = {
        @Authorization(value = "BasicAuth")
    })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ListResponse<MediaModel>"  ) })
    @RequestMapping(value = "/media/{modelName}/{modelId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ListResponse<MediaModel>> getMedia(@ApiParam(value = "",required=true, example = "0") @PathVariable("modelName") String modelName,@ApiParam(value = "",required=true, example = "0") @PathVariable("modelId") Integer modelId,@ApiParam(value = "Paging offset", required = true, defaultValue = "0", example = "0")  @RequestParam(value = "offset", required = true, defaultValue="0") Integer offset,@ApiParam(value = "Paging limit", required = true, defaultValue = "-1", example = "-1")  @RequestParam(value = "limit", required = true, defaultValue="-1") Integer limit,@ApiParam(value = "Sort the list", allowableValues = "createdAt, order")  @RequestParam(value = "sort_column", required = false) String sortColumn,@ApiParam(value = "Sort Order", allowableValues = "asc, desc")  @RequestParam(value = "sort_order", required = false) String sortOrder);


    @ApiOperation(value = "Update the media information", nickname = "updateMedia", notes = "", authorizations = {
        @Authorization(value = "BasicAuth")
    })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "DetailResponse<MediaModel>"  ) })
    @RequestMapping(value = "/media/{mediaId}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<DetailResponse<MediaModel>> updateMedia(@ApiParam(value = "ID of the Media",required=true, example = "0") @PathVariable("mediaId") Integer mediaId,@ApiParam(value = "Title of the Media")  @RequestParam(value = "title", required = false) String title,@ApiParam(value = "Display order of the Media")  @RequestParam(value = "order", required = false) Integer order);


    @ApiOperation(value = "Upload an media item. Image (image/png, image/jpeg), Video (video/mp4, video/quicktime, video/mpeg), Other (application/pdf).", nickname = "uploadImage", notes = "", authorizations = {
        @Authorization(value = "BasicAuth")
    })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "DetailResponse<MediaModel>"  ),
        @ApiResponse(code = 400, message = "Invalid file"  ),
        @ApiResponse(code = 403, message = "invalid file extension"  ) })
    @RequestMapping(value = "/media/{modelName}/{modelId}",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<DetailResponse<MediaModel>> uploadImage(@ApiParam(value = "e.g. User, Product, Contact",required=true, example = "0") @PathVariable("modelName") String modelName,@ApiParam(value = "Id of the e.g. User, Product, Contact",required=true, example = "0") @PathVariable("modelId") Integer modelId,@ApiParam(value = "file detail") @RequestPart("file") MultipartFile file,@ApiParam(value = "Title of the Video")  @RequestParam(value = "title", required = false) String title,@ApiParam(value = "Order used to display on Client")  @RequestParam(value = "order", required = false) Integer order);

}
