/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CreateDictReq;
import org.openapitools.model.Dict;
import org.openapitools.model.EditDictReq;
import org.openapitools.model.KeyValueDto;
import org.openapitools.model.ResultListDict;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-14T14:09:29.012Z[Etc/UTC]")

@Validated
@Api(value = "dict", description = "the dict API")
public interface DictApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "dictsCreate", notes = "", tags={ "core", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content") })
    @RequestMapping(value = "/dict/",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> dictsCreate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateDictReq entry) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "dictsFindOne", notes = "", response = Dict.class, tags={ "core", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Dict.class) })
    @RequestMapping(value = "/dict/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Dict> dictsFindOne(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"expand\" : \"{}\",  \"name\" : \"name\",  \"id\" : \"id\",  \"category\" : \"category\",  \"translate\" : \"translate\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "dictsQuery", notes = "", response = ResultListDict.class, tags={ "core", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ResultListDict.class) })
    @RequestMapping(value = "/dict/query",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ResultListDict> dictsQuery(@ApiParam(value = "") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "") @Valid @RequestParam(value = "category", required = false) String category,@ApiParam(value = "", defaultValue = "1.0d") @Valid @RequestParam(value = "page", required = false, defaultValue="1.0d") Double page,@ApiParam(value = "", defaultValue = "10.0d") @Valid @RequestParam(value = "size", required = false, defaultValue="10.0d") Double size,@ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"query\" : {    \"size\" : 6.027456183070403,    \"page\" : 1.4658129805029452  },  \"count\" : 0.8008281904610115,  \"list\" : [ {    \"expand\" : \"{}\",    \"name\" : \"name\",    \"id\" : \"id\",    \"category\" : \"category\",    \"translate\" : \"translate\"  }, {    \"expand\" : \"{}\",    \"name\" : \"name\",    \"id\" : \"id\",    \"category\" : \"category\",    \"translate\" : \"translate\"  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "dictsSearch", notes = "", response = KeyValueDto.class, responseContainer = "List", tags={ "core", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = KeyValueDto.class, responseContainer = "List") })
    @RequestMapping(value = "/dict/search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<KeyValueDto>> dictsSearch(@ApiParam(value = "") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "") @Valid @RequestParam(value = "value", required = false) String value,@ApiParam(value = "") @Valid @RequestParam(value = "category", required = false) String category) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"label\" : \"label\",  \"value\" : \"value\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "dictsUpdate", notes = "", response = Dict.class, tags={ "core", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Dict.class) })
    @RequestMapping(value = "/dict/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Dict> dictsUpdate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody EditDictReq entry) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"expand\" : \"{}\",  \"name\" : \"name\",  \"id\" : \"id\",  \"category\" : \"category\",  \"translate\" : \"translate\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
