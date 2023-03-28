import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';

@customElement('vista-lista-comentarios-usuario-no-registrado-item')
export class VistaListaComentariosUsuarioNoRegistradoItem extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: center; flex-grow: 0; width: 15%; justify-content: center;">
  <vaadin-avatar id="fotoPerfil" style="align-self: center;"></vaadin-avatar>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="align-self: center; flex-grow: 1;">
  <h3 id="nombreUsuario">Nombre de usuario</h3>
  <label id="comentarioL">Comentario</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="align-self: center; flex-grow: 1; justify-content: center;">
  <label id="numeroMeGusta" style="align-self: center;">0</label>
  <label id="meGustaL">Me gusta</label>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
