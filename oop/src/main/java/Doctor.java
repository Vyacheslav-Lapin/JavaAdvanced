public class Doctor extends MedicalStaff {
    @Override
    public void info() {
        System.out.println("Doctor");
    }

    public static void main(String[] args) {
//        Doctor doctor = new Doctor();
//        doctor.info();
//        MedicalStaff med = new Doctor();
//        med.info();

        for (MedicalStaff medicalStaff: getMedicalStaffs())
            medicalStaff.info();
    }

    private static MedicalStaff[] getMedicalStaffs() {
        return new MedicalStaff[]{
                    new MedicalStaff(),
                    new Doctor(),
                    new Nurse(),
                    new Doctor(),
                    new Nurse()
            };
    }
}
