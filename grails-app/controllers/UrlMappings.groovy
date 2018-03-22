package v2ex.grails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "main", action: "home", view: "home")

        "/robots.txt"(view: '/robots')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
