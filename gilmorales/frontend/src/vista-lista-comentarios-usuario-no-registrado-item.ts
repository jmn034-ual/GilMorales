import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-horizontal-layout class="content" id="vaadinHorizontalLayout" style="width: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: center; flex-grow: 0; justify-content: center; flex-shrink: 0;">
  <vaadin-avatar id="fotoPerfil" style="align-self: center;"></vaadin-avatar>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing-s" id="vaadinVerticalLayout" style="align-self: center; flex-grow: 0; flex-shrink: 0; width: 53%;">
  <vaadin-button theme="tertiary" id="nombreUsuario">
    Nombre de usuario 
  </vaadin-button>
  <label id="comentarioL" style="flex-shrink: 0; align-self: stretch; margin-left: var(--lumo-space-xs);">Comentario</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="align-self: center; flex-grow: 1; justify-content: flex-end; flex-shrink: 0;">
  <label id="numeroMeGusta" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); width: 20px; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; height: 20px; justify-content: center; font-weight: bold;">0</label>
  <vaadin-button theme="icon large" aria-label="Add new" id="meGustaB" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; height: 100px; display: flex; 
justify-content: center; align-items: center; justify-content: center; font-weight: bold; width: 50px; height: 50px; padding: 0px; color: red;"></vaadin-button>
  <vaadin-button id="denunciarB" style="align-self: center;">
    Denunciar 
  </vaadin-button>
  <vaadin-button id="borrarComentarioB" style="align-self: center;">
    Borrar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
<hr style="width: 100%;">
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
