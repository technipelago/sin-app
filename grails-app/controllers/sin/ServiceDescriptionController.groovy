package sin

class ServiceDescriptionController {

    def index() {

        println params

        if (!params.max) {
            params.max = 10
        }
        if (!params.sort) {
            params.sort = "description"
        }
        def allServices = ServiceDescription.list(params)
        def serviceCount = ServiceDescription.count()
        return [allServices: allServices, serviceCount: serviceCount]
    }
    def show(String description) {
        ServiceDescription service = ServiceDescription.findByDescription(description)
        return [service: service]
    }
}
