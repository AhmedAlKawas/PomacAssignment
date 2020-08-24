package com.example.pomacassignment.network.model.responds;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class GetArticlesResponse implements Serializable {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("num_results")
    @Expose
    private Integer numResults;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Integer getNumResults() {
        return numResults;
    }

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public class Multimedium {

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("format")
        @Expose
        private String format;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("subtype")
        @Expose
        private String subtype;
        @SerializedName("caption")
        @Expose
        private String caption;
        @SerializedName("copyright")
        @Expose
        private String copyright;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getCopyright() {
            return copyright;
        }

        public void setCopyright(String copyright) {
            this.copyright = copyright;
        }

    }

    public class Result {

        @SerializedName("slug_name")
        @Expose
        private String slugName;
        @SerializedName("section")
        @Expose
        private String section;
        @SerializedName("subsection")
        @Expose
        private String subsection;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("abstract")
        @Expose
        private String _abstract;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("byline")
        @Expose
        private String byline;
        @SerializedName("thumbnail_standard")
        @Expose
        private String thumbnailStandard;
        @SerializedName("item_type")
        @Expose
        private String itemType;
        @SerializedName("source")
        @Expose
        private String source;
        @SerializedName("updated_date")
        @Expose
        private String updatedDate;
        @SerializedName("created_date")
        @Expose
        private String createdDate;
        @SerializedName("published_date")
        @Expose
        private String publishedDate;
        @SerializedName("first_published_date")
        @Expose
        private String firstPublishedDate;
        @SerializedName("material_type_facet")
        @Expose
        private String materialTypeFacet;
        @SerializedName("kicker")
        @Expose
        private String kicker;
        @SerializedName("subheadline")
        @Expose
        private String subheadline;
        @SerializedName("des_facet")
        @Expose
        private Object desFacet;
        @SerializedName("org_facet")
        @Expose
        private Object orgFacet;
        @SerializedName("per_facet")
        @Expose
        private Object perFacet;
        @SerializedName("geo_facet")
        @Expose
        private Object geoFacet;
        @SerializedName("related_urls")
        @Expose
        private Object relatedUrls;
        @SerializedName("multimedia")
        @Expose
        private List<Multimedium> multimedia = null;

        public String getSlugName() {
            return slugName;
        }

        public void setSlugName(String slugName) {
            this.slugName = slugName;
        }

        public String getSection() {
            return section;
        }

        public void setSection(String section) {
            this.section = section;
        }

        public String getSubsection() {
            return subsection;
        }

        public void setSubsection(String subsection) {
            this.subsection = subsection;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAbstract() {
            return _abstract;
        }

        public void setAbstract(String _abstract) {
            this._abstract = _abstract;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getByline() {
            return byline;
        }

        public void setByline(String byline) {
            this.byline = byline;
        }

        public String getThumbnailStandard() {
            return thumbnailStandard;
        }

        public void setThumbnailStandard(String thumbnailStandard) {
            this.thumbnailStandard = thumbnailStandard;
        }

        public String getItemType() {
            return itemType;
        }

        public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getUpdatedDate() {
            return updatedDate;
        }

        public void setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public String getPublishedDate() {
            return publishedDate;
        }

        public void setPublishedDate(String publishedDate) {
            this.publishedDate = publishedDate;
        }

        public String getFirstPublishedDate() {
            return firstPublishedDate;
        }

        public void setFirstPublishedDate(String firstPublishedDate) {
            this.firstPublishedDate = firstPublishedDate;
        }

        public String getMaterialTypeFacet() {
            return materialTypeFacet;
        }

        public void setMaterialTypeFacet(String materialTypeFacet) {
            this.materialTypeFacet = materialTypeFacet;
        }

        public String getKicker() {
            return kicker;
        }

        public void setKicker(String kicker) {
            this.kicker = kicker;
        }

        public String getSubheadline() {
            return subheadline;
        }

        public void setSubheadline(String subheadline) {
            this.subheadline = subheadline;
        }

        public Object getDesFacet() {
            return desFacet;
        }

        public void setDesFacet(Object desFacet) {
            this.desFacet = desFacet;
        }

        public Object getOrgFacet() {
            return orgFacet;
        }

        public void setOrgFacet(Object orgFacet) {
            this.orgFacet = orgFacet;
        }

        public Object getPerFacet() {
            return perFacet;
        }

        public void setPerFacet(Object perFacet) {
            this.perFacet = perFacet;
        }

        public Object getGeoFacet() {
            return geoFacet;
        }

        public void setGeoFacet(Object geoFacet) {
            this.geoFacet = geoFacet;
        }

        public Object getRelatedUrls() {
            return relatedUrls;
        }

        public void setRelatedUrls(Object relatedUrls) {
            this.relatedUrls = relatedUrls;
        }

        public List<Multimedium> getMultimedia() {
            return multimedia;
        }

        public void setMultimedia(List<Multimedium> multimedia) {
            this.multimedia = multimedia;
        }

    }
}