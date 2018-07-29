package ru.clinic.myClinic;

public class Clinic {
    private final Client [] clients;

    public Clinic(int size) {
        this.clients = new Client[size];
    }

    public Client[] getClients() {
        return clients;
    }

    public void addClient(int id, String name, Pet pet) throws UserUncorrectedExeption {
        for(int i = 0; i < clients.length; i++){
            if(clients[i]!=null&&clients[i].getId()==id) {
                throw new UserUncorrectedExeption("Клиент с таким id уже существует");
            } else
            if(clients[i] == null) {
                Client client = new Client(id, name, pet);
                clients[i] = client;
                return;
            }

            }
        }
        public void showList(){
            for(Client cl : getClients()) {
                if(cl!=null) {
                    System.out.println(cl.getId() + " " + cl.getName() + " " + cl.getPet().toString());
                }
            }
            System.out.println("===================================================================");
        }

        public void searchForNameClient(String nameClient){
        boolean res = false;
            for(int i = 0; i < clients.length; i++) {
                if (clients[i] != null && clients[i].getName().equals(nameClient)) {
                    System.out.println(clients[i].toString());
                    res = true;
                }
            }
            if(!res){
                System.out.println("Client not found!!!");
            }
        }

        public void searchForNamePet(String namePet){
            boolean res = false;
            for(int i = 0; i < clients.length; i++) {
                if (clients[i] != null && clients[i].getPet().getName().equals(namePet)) {
                    System.out.println(clients[i].toString());
                    res = true;
                }
            }
            if(!res){
                System.out.println("Client not found!!!");
            }
        }

        public void updateClient(int id, String nameClient){
            boolean res = false;
            for(int i = 0; i < clients.length; i++) {
                if (clients[i] != null && clients[i].getId() == (id)) {
                    clients[i].setName(nameClient);
                    showList();
                    res = true;
                }
            }
            if(!res){
                System.out.println("Id is not corrected!!");
            }
        }

        public void updateClient(int id, String nameClient, String namePet){
            boolean res = false;
            for(int i = 0; i < clients.length; i++) {
                if (clients[i] != null && clients[i].getId() == (id)) {
                    clients[i].setName(nameClient);
                    Pet pet = clients[i].getPet();
                    pet.setName(namePet);
                    clients[i].setPet(pet);
                    showList();
                    res = true;
                }
            }
            if(!res){
                System.out.println("Id is not corrected!!");
            }
        }

}
