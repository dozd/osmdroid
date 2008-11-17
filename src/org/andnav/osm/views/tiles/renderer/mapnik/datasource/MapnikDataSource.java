package org.andnav.osm.views.tiles.renderer.mapnik.datasource;

import java.util.List;

import org.andnav.osm.views.tiles.renderer.mapnik.MapnikEnvelope;
import org.andnav.osm.views.tiles.renderer.mapnik.MapnikParameters;
import org.andnav.osm.views.tiles.renderer.mapnik.feature.MapnikFeature;
import org.andnav.osm.views.tiles.renderer.mapnik.feature.MapnikFeatureLayerDescriptor;

public abstract class MapnikDataSource {

    public enum MapnikDataSourceType
    {
    	Vector,
    	Raster
    }
    
    protected MapnikParameters mParameters;
    
    public MapnikDataSource(MapnikParameters p)
    {
    	mParameters = p;
    }
    	
    public MapnikParameters getParams()
    {
    	return mParameters;
    }
    
    public abstract MapnikDataSourceType getType();
    
    public abstract List<MapnikFeature> getFeatures();
    public abstract List<MapnikFeature> getFeaturesAtPoint(double[] coords);
    public abstract MapnikEnvelope getEnvelope();
    public abstract MapnikFeatureLayerDescriptor getLayerDescriptor();

}