import sin.ServiceDescription
import sin.ServiceDescriptionController
import sin.ServiceInstance
import sin.ServiceRelation

class BootStrap {

    def init = { servletContext ->

        // Create some demo data.
        def service1 = new ServiceDescription(serviceName: "Avtala", description: "avtala.se", sourceDepository: "https://github.com/avtala/", status: "Active").save(failOnError: true);
        def service2 = new ServiceDescription(serviceName: "SellBell", description: "SellBell", sourceDepository: "https://github.com/sellbell/", status: "Active").save(failOnError: true);
        def service3 = new ServiceDescription(serviceName: "Villabesiktningar", description: "Villabesiktningar", sourceDepository: "https://github.com/villa/", status: "Active").save(failOnError: true);
        def service4 = new ServiceDescription(serviceName: "DocTemps", description: "Document templates", sourceDepository: "https://github.com/docTemp/", status: "Active").save(failOnError: true);

        def instans1 = new ServiceInstance(environment: "pruduction", region: "Europe", dataCenter: "Kista", rack: "42", host: "Web 04", port: 8080).save(failOnError: true);
        def instans2 = new ServiceInstance(environment: "pruduction", region: "Europe", dataCenter: "Kista", rack: "28", host: "Web 05", port: 8080).save(failOnError: true);
        def instans3 = new ServiceInstance(environment: "pruduction", region: "Europe", dataCenter: "Kista", rack: "34", host: "Web 06", port: 8080).save(failOnError: true);

        def relation1 = new ServiceRelation(fromService: service1, toService: service4, notes: "Avtala uses document templates when printing documents to pdf:s").save(failOnError: true);


    }
    def destroy = {
    }
}
