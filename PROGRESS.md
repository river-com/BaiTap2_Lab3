# Báo cáo Tiến độ Dự án (Progress Report) - Bài Tập 2 Lab 3

## Tiến độ thực hiện & Các lần Commit (Commits History)

### 1. Commit 1: Khởi tạo cấu trúc project, Model dữ liệu và Layout 2 màn hình
- **Nội dung:**
  - Thiết lập cấu trúc thư mục và cấu hình Gradle.
  - Tạo Data Class `Student.kt` lưu thông tin sinh viên (Nguyễn Ngọc Huy, MSV: 2415053122119, Lớp: 24T1, Tuổi: 20, Email: huy@gmail.com).
  - Thiết kế giao diện `activity_main.xml` (Màn hình chính hiển thị thông tin sinh viên) và `activity_second.xml` (Màn hình chi tiết).
  - Tạo file báo cáo tiến độ `PROGRESS.md`.

### 2. Commit 2: Triển khai View Binding, Scope Functions và Intent điều hướng
- **Nội dung:**
  - Viết code cho `MainActivity.kt`: Sử dụng View Binding để liên kết view, sử dụng các Scope Functions (`apply`, `run`, `with`, `also`) để khởi tạo và binding dữ liệu. Tạo `Intent` truyền dữ liệu sinh viên sang màn hình 2.
  - Viết code cho `SecondActivity.kt`: Nhận dữ liệu sinh viên qua `Intent`, sử dụng Scope Functions (`let`, `run`, `apply`) để xử lý an toàn và hiển thị thông tin chi tiết.
  - Cấu hình điều hướng quay lại `MainActivity` bằng `Intent`.
  - Cập nhật `AndroidManifest.xml` đăng ký `SecondActivity`.

### 3. Commit 3: Hoàn thiện tài liệu README.md và đẩy lên GitHub
- **Nội dung:**
  - Tạo và hoàn thiện file `README.md` báo cáo chi tiết toàn bộ dự án.
  - Kiểm tra build thành công (Build Success).
  - Chuẩn bị sẵn sàng kết nối remote GitHub: `https://github.com/river-com/BaiTap2_Lab3.git`.
