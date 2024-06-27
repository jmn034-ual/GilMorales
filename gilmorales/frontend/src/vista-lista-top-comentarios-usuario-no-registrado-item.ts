import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista-top-comentarios-usuario-no-registrado-item')
export class VistaListaTopComentariosUsuarioNoRegistradoItem extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; justify-content: center; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);" id="vaadinHorizontalLayout" theme="spacing-s">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: center; flex-grow: 0; justify-content: center;">
  <vaadin-avatar id="fotoPerfil" style="align-self: center;"></vaadin-avatar>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="align-self: center; flex-grow: 0; flex-shrink: 0; width: 70%;">
  <vaadin-button theme="tertiary" id="nombreDeUsuarioB">
    Nombre de usuario 
  </vaadin-button>
  <label id="comentarioL" style="padding-left: var(--lumo-space-s); align-self: stretch;">Comentario</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="align-self: center; flex-grow: 0; flex-shrink: 0;">
  <label id="numeroMeGusta" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); width: 20px; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; height: 20px; justify-content: center; font-weight: bold;">0</label>
  <vaadin-button theme="icon" aria-label="Add new" id="meGustaB" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; justify-content: center; font-weight: bold; width: 50px; height: 50px; padding: 0px;">
   <iron-icon icon="vaadin:heart-o" id="ironIcon"></iron-icon>
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="borrarComentarioB" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; justify-content: center; font-weight: bold; width: 50px; height: 50px; padding: 0px;">
   <iron-icon icon="vaadin:trash" id="ironIcon1" style="color: red;"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
