package com.example.mycollections.controllers;

public class AlbumController {
    private final List<Album> albums = new ArrayList<>();

    public AlbumController() {
        albums.add(new Album("name1", "Artist1", 1969, 17));
        albums.add(new Album("Name2", "Artist2", 1977, 10));
        albums.add(new Album("Name3", "Artist3", 1973, 10));
    }

    @GetMapping("/albums")
    public List<Album> getAlbums() {
        return albums;
    }

    @GetMapping("/albums/html")
    public String getAlbumsHtml() {
        StringBuilder html = new StringBuilder();
        html.append("<ul>");
        for (Album album : albums) {
            html.append("<li>")
                .append(album.getName())
                .append(" by ")
                .append(album.getArtist())
                .append(" (")
                .append(album.getYear())
                .append(") - ")
                .append(album.getTracks())
                .append(" tracks</li>");
        }
        html.append("</ul>");
        return html.toString();
    }
}
